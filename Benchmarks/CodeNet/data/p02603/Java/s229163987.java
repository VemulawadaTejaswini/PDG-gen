import java.util.*;
import java.math.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int max = 1000;
        if(n==0 || n==1)
        {
            System.out.println("1000");
        }
        else
        {
            int initial = 1000;
            int day;
            for(day=0;day<n-1;day++)
            {
                if(arr[day]<arr[day+1])
                {
                    break;
                }
            }
            int curr = 1000;
            int stock = curr/arr[day];
            curr -=stock*arr[day];
            stack.push(arr[day]);
            for(int i=day+1;i<n;i++)
            {
                if(stack.peek()<=arr[i])
                {
                    stack.push(arr[i]);
                }
                else
                {
                    curr +=stack.peek()*stock;
                    max = Math.max(curr,max);
                    stock = curr/arr[i];
                    curr -=stock*arr[i]; 
                    stack.push(arr[i]);
                }
            }
            if(stack.size()!=0)
            {
            curr +=stock*stack.peek();
            max = Math.max(max,curr);
            }
            System.out.println(max);

        }

    }
}