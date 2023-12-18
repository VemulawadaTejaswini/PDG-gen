import java.util.Scanner;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int[] listB = new int [N-1];
        int [] listA = new int [N];
        
        for (int index=0; index<N-1; index++){
            listB[index]=sc.nextInt();
        }
        
        int lastNum = 0;
        
        for (int index=0; index<N-1; index++){
            int num = listB[index];
            listA[index]=num;
            if (index!=0){
                if (listA[index]>lastNum){
                    listA[index]=lastNum;
                }
            }
            lastNum = num;
        }
        
        listA[N-1]=listB[N-2];
        
        int total = 0;
        
        for (int index=0; index<N; index++){
            total+=listA[index];
        }
        
        System.out.println(total);
    }
}