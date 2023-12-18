import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
    
    if(a==b){
        //a＝＝bの場合
        System.out.println("a == b");
       } 
    
    else{
        //a<bの場合
        if (a<b){
        System.out.println("a < b");    
        }
        
        //a＞bの場合
       else{
        System.out.println("a > b");  
         
        }        
    }
    //    System.out.println();
    }
}
