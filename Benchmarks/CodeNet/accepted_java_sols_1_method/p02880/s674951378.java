import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++){
                if(i*j==a){
                    count=1;
                }
                
            }
        }
        if(count==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}