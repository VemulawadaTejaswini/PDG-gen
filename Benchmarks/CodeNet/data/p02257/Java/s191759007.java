import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[9999];
        boolean[] booleans=new boolean[9999];
        for(int i=0;i<9999;i++){
            ints[i]=i+2;
            booleans[i]=true;
        }
        for(int i=0;i<9999;i++){
            if(booleans[i]==false) continue;
            for(int j=(i+2)*2-2;j<9999;j+=i+2){
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
