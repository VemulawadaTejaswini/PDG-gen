import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int[] list = new int [N];
        int[] list2 = new int [N];
        
        for (int index=0; index<N; index++){
            list[index]=sc.nextInt();
        }
        
        for (int index=0; index<N; index++){
            list2[index]=index+1;
        }
        
        int count = 0;
        for (int index=0; index<N; index++){
            if (list[index]!=list2[index]){
                count++;
            }
        }
        
        if (count>2){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}