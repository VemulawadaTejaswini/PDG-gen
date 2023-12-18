import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        for(int j=num-1;j>=0;j--){
            if(j==0){
                System.out.println(a[j]);
            }else{
               System.out.print(a[j]+" "); 
            }
            
            
        }
    }
}
