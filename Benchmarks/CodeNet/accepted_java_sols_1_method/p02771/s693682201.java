import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numa = scan.nextInt();
        int numb = scan.nextInt();
        int numc = scan.nextInt();
        if(numa == numb && numb == numc && numa == numc){
            System.out.println("No");
        }else if(numa == numb){
            System.out.println("Yes");
        }else if(numa == numc){
            System.out.println("Yes");
        }else if(numb == numc){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        } 
    }   
}