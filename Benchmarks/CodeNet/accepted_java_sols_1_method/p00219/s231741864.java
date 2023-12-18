import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int c;
        int[] ice = new int[10];

        while((n = sc.nextInt())!=0){
            for(int i=0;i<n;i++){
                c = sc.nextInt();
                ice[c]++;
            }
            for(int i=0;i<10;i++){
                if(ice[i]==0){System.out.print("-");}
                else{
                    for(int j=0;j<ice[i];j++){
                        System.out.print("*");
                    }
                }
                System.out.println("");
                ice[i]=0;
            }
        }
        
    }
}
