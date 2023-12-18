import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pre = sc.next();
        String pre2 = pre;
        String rear = sc.next();
        
        String join = pre.concat(pre2);
        if(join.contains(rear)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        
    }
}
