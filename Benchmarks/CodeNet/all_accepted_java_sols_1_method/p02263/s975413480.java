
import java.util.Scanner;
import java.util.Stack;

class Main
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<Integer>();
        String [] arr = sc.nextLine().split(" ");
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {   
            String s; 
            if(arr[i].compareTo("+")==0||arr[i].compareTo("-")==0||arr[i].compareTo("*")==0)
            {
                int res=0;
                switch(arr[i])
                {
                    case "+":
                        res= st.pop()+st.pop();
                        break;
                    case "-":
                        res=  -1 *  st.pop() + st.pop();
                        break;
                    case "*":
                        res= st.pop()* st.pop();    
                        break;
                }
                st.push(res);
            }
            else   st.push(Integer.parseInt(arr[i]));
        }
        System.out.println(st.peek());
    }
}
       



