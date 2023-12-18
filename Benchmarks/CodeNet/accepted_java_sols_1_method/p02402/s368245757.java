import java.util.Scanner;
class Main
{
   public static void main(String[] args)
  	{
  	Scanner sc1 = new Scanner(System.in);
  	int min, max; 
        long sum;
        int n = sc1.nextInt();
        int a = sc1.nextInt();
        min = max = a;
        sum = a;
        for(int i =1; i<n; i++){
        a = sc1.nextInt();
        if(min>a) min = a;
        if(max<a) max = a;
        sum += a;
        }
        System.out.println(min+" "+max+" " +sum);
  	}
}


