import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][N];
        boolean[][] exist = new boolean[N][N];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                nums[i][j] = Math.min(i, Math.min(N-1-i, Math.min(j, N-1-j)));
                exist[i][j] = true;
            }
        }
        long ans = 0;
        for(int i = 0 ; i < N*N ; i++){

            int num = sc.nextInt()-1;
            int x = getColumn(N, num);
            int y = getRow(N, num);
            
            exist[x][y] = false;
            ans += nums[x][y];
            LinkedList<Integer> stack = new LinkedList<Integer>();
            stack.addFirst(getIndex(N, x, y));
            while(!stack.isEmpty()){
                int now = stack.removeFirst();
                int nowX = getColumn(N, now);
                int nowY = getRow(N, now);
                int value = nums[nowX][nowY];
                if(exist[nowX][nowY]){
                    value++;
                }
                if(nowX > 0){
                    if(nums[nowX-1][nowY] > value){
                        nums[nowX-1][nowY] = value;
                        stack.addLast(getIndex(N, nowX-1, nowY));
                    }
                }
                if(nowX < N-1){
                    if(nums[nowX+1][nowY] > value){
                        nums[nowX+1][nowY] = value;
                        stack.addLast(getIndex(N, nowX+1, nowY));
                    }
                }
                if(nowY > 0){
                    if(nums[nowX][nowY-1] > value){
                        nums[nowX][nowY-1] = value;
                        stack.addLast(getIndex(N, nowX, nowY-1));
                    }
                }
                if(nowY < N-1){
                    if(nums[nowX][nowY+1] > value){
                        nums[nowX][nowY+1] = value;
                        stack.addLast(getIndex(N, nowX, nowY+1));
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static int getColumn(int N, int v){
        return v%N;
    }

    static int getRow(int N, int v){
        return v/N;
    }

    static int getIndex(int N, int column, int row){
        return N*row + column;
    }
}
