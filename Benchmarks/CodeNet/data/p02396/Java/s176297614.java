import java.util.Scanner;
import java.util.LinkedList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<Integer>();
        while(sc.hasNext()){
            int j=sc.nextInt();
            if(j==0){
                break;
            }
            l.add(j);
        }
        int n=0;
        for(int i=0; i<l.size(); i++){
            if(l.get(i)<1 || 10000<l.get(i)){
                n++;
            }
        }
        if(l.size()>9999){
            System.out.println("Too Large");
        }else if(n!=0){
            System.out.println("There is an incorrect number.");
        }else{
            int k=0;
            for(int i=0; i<l.size(); i++){
                k++;
                System.out.println("case "+k+": "+l.get(i));
            }
        }
    }
}