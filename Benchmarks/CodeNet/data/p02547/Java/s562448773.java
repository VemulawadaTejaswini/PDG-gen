import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        int[] a = new int[2];
        int[] b = new int[2];
        
        for(int i=1;i<t;i++){
             a[i] = sc.nextInt();
             b[i]  = sc.nextInt();
            if(a[i]==b[i]){
                count++;
               
            }

        }if(count>=3){
            System.ot.print("Yes");
        }else{
          System.ot.println("No");
        }

    }
}