import java.util.Scanner;


public class Main{
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int w =sc.nextInt();
        int n=sc.nextInt();
        
        int[] num;
        num=new int[w];

        for(int i=0;i<w;i++){

            num[i]=i+1;

        }
        sc.useDelimiter(",|\n");
        for(int i=0;i<n;i++){

           String str=sc.nextLine();
           int a = sc.nextInt();
			int b = sc.nextInt();
           int temp = num[a-1];
           num[a-1] = num[b-1];
           num[b-1] = temp;
            
        }



        for(int i=0;i<w;i++){

            System.out.println(num[i]);
        }

        sc.close();
    }
}
