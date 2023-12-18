import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[99999999];
        boolean[] booleans=new boolean[99999999];
        for(int i=0;i<99999999;i++){
            ints[i]=i+2;
            booleans[i]=true;
        }
        for(int i=0;i<Math.sqrt(99999999)+1;i++){
            if(booleans[i]==false) continue;
            for(int j=(i+2)*2-2;j<99999999;j+=i+2){
                booleans[j]=false;
            }
        }
        int result=0;
        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            if(booleans[x-2]==true) result++;
        }
        System.out.println(result);
    }

}

