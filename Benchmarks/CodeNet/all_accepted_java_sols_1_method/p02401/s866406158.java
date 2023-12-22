import java.util.Scanner;
import java.util.LinkedList;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a = new LinkedList<Integer>();
        LinkedList<Integer> b = new LinkedList<Integer>();
        LinkedList<String> op = new LinkedList<String>();
        int n=0;
        while(true){
            n++;
            a.add(sc.nextInt());
            if(a.get(n-1)<0 || 20000<a.get(n-1)){
                System.exit(-1);
            }
            op.add(sc.next());
            b.add(sc.nextInt());
            if(b.get(n-1)<0 || 20000<b.get(n-1)){
                System.exit(-1);
            }
            if(op.get(n-1).equals("?")){
                break;
            }
        }
        for(int i=0; i<n-1; i++){
            if(op.get(i).equals("+")){
                System.out.println(a.get(i)+b.get(i));
            }else if(op.get(i).equals("-")){
                System.out.println(a.get(i)-b.get(i));
            }else if(op.get(i).equals("*")){
                System.out.println(a.get(i)*b.get(i));
            }else if(op.get(i).equals("/")){
                System.out.println(a.get(i)/b.get(i));
            }
        }
    }
}