import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer(sc.next());
        sc.nextLine();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            String op = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (op){
                case "replace":
                    String p = sc.next();
                    sb.replace(a, b+1, p);
                    break;
                    
                case "print":
                    System.out.println(sb.substring(a, b+1));
                    break;
                    
                case "reverse":
                    StringBuffer r = new StringBuffer(sb.substring(a, b+1));
                    r.reverse();
                    sb.replace(a, b+1, r.toString());
                    break;
            }
            sc.nextLine();
        }
    }
}
