import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[] = sc.next().toCharArray();
        if(arr[0]!='A'){
            System.out.println("WA");
            return;
        }
        arr[0]='x';
        boolean f= false;
        for(int i=2;i<=arr.length-2;i++){
            if(arr[i]=='C'){
                f= true;
                arr[i] ='x';
                break;
            }
        }
        if(!f){
            System.out.println("WA"); return;
        }
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                System.out.println("WA");
                return ;
            }
        }
        System.out.println("AC");
    }
}
