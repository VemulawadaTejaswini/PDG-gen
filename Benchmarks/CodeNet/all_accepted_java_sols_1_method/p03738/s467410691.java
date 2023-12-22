import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        
        if(a.length<b.length){
            System.out.println("LESS");
        }else if(a.length>b.length){
            System.out.println("GREATER");
        }else{
            for(int i = 0;i<a.length;i++){
                if(a[i]>b[i]){
                    System.out.println("GREATER");
                    break;
                }else if(a[i]<b[i]){
                    System.out.println("LESS");
                    break;
                }else{
                    if(i==a.length-1){
                        System.out.println("EQUAL");
                    }
                }
            }
        }

    }
}




