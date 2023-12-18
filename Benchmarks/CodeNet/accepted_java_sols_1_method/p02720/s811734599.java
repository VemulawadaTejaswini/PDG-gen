import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.nextLine());
      	Long num[] = new Long[n];
      	for(int i = 0; i < 9 && i < n; i++)
        {
          	num[i] = (long)(i + 1);
        }
      	int counter = 9;
      	int begin = 0;
      	//boolean judge = true;
      	while( counter < n )
        {
         	 int fixedCounter = counter;
          
          	for(int i = begin; i < fixedCounter && counter < n; i++)
            {
              	int r = (int)(num[i] % 10);
             	 if(r == 0 )
                 {
                   	num[counter] = num[i] * 10;
                   	counter++;
                   	if(counter < n)
                    {
                   		num[counter] = num[i] * 10 + 1;
                   		counter++;
                    }
                 }else if(r == 9){
                   	num[counter] = num[i] * 10 + 8;
                   	counter++;
                   	if(counter < n)
                    {
                   		num[counter] = num[i] * 10 + 9;
                   		counter++;
                    }
                 }else{
                   	
                   	num[counter] = num[i] * 10 + r - 1;
                   	counter++;
                   
                   	if(counter < n)
                    {
                   		num[counter] = num[i] * 10 + r;
                   		counter++;
                    }
                   
                   	if(counter < n)
                    {
                   		num[counter] = num[i] * 10 + r + 1;
                   		counter++;
                    }
                 }
            }
          	begin = fixedCounter;
        }
      
      	System.out.print(num[n - 1]);
    }
}