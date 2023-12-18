
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[n];
        for(int i=0;i<n;i++){
            ints[i]=i;
        }
        int q=scanner.nextInt();
        for(int i=0;i<q;i++){
            int com=scanner.nextInt();
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int keyX=ints[x];
            int keyY=ints[y];
            if(com==0){
                for(int j=0;j<n;j++){
                    if(ints[j]==keyY) ints[j]=keyX;
                }
            }else{
                if(keyX==keyY){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }

            }
        }
    }
}

