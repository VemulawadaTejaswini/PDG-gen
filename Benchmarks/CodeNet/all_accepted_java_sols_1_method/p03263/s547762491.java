import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];
        
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int i = 0, j = 0;
        int cnt = 0;
        while(cnt < H*W-1){
            if(a[i][j]%2 == 1){
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(i+1);
                list1.add(j+1);
                if(i%2 == 0){
                    if(j != W-1){
                        a[i][j+1]++;
                        j++;
                    } else {
                        a[i+1][j]++;
                        i++;
                    }
                } else {
                    if(j != 0){
                        a[i][j-1]++;
                        j--;
                    } else {
                        a[i+1][j]++;
                        i++;
                    }
                }
                list1.add(i+1);
                list1.add(j+1);
                list.add(list1);
            } else {
                if(i%2 == 0){
                    if(j != W-1){
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    if(j != 0){
                        j--;
                    } else {
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(list.size());
        for(int k = 0; k < list.size(); k++){
            System.out.println(list.get(k).get(0) + " " + list.get(k).get(1) + " " + 
            list.get(k).get(2) + " " + list.get(k).get(3));
        }
    }
}