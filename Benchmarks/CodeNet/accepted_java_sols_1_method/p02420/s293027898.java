import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            String str = sc.next();
            sc.nextLine();
            
            if(str.equals("-")) break;
            
            int m = sc.nextInt();
            sc.nextLine();
            
            String head = "";
            String tail = "";
            
            for(int i=0;i<m;i++){
                int h = sc.nextInt();
                sc.nextLine();
                
                head = str.substring(0,h);
                tail = str.substring(h,str.length());
                tail += head;
                str = tail;
            }
            System.out.println(tail);
        }
    }
}
