import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        n = sc.nextInt();
        x = sc.nextInt();

        ArrayList<Integer> l_list = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            l_list.add(sc.nextInt());
        }

        ArrayList<Integer> jump = new ArrayList<Integer>();
        jump.add(0);
        for(int i = 1; i<n+1; i++)
        {  
            jump.add(jump.get(i-1)+l_list.get(i-1));
        }

        int count = 0;
        for(int i = 0; i<n+1; i++)
        {
            if(jump.get(i)<=x){
                count++;
            }
            else{
                break;
            }
            
        }
        System.out.println(count); 
    }
}