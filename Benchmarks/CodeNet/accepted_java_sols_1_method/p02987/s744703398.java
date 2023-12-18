import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        char a[] = s.toCharArray();
         int count = 0 ;
        for(int j = 0 ; j<a.length ; j++)
        {
        for(int  i= 1+j; i<a.length ; i++)
        {
              if(a[j]==a[i]){
                 count++;
                   break ;
              }  
           
        } 
      
    }  
        if(count==2)System.out.println("Yes");
        else System.out.println("No");
 
 }
}
