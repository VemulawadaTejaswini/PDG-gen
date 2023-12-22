import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
        ArrayList <Integer> c = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        
        if(n%2 == 0){
        for(int i=0; i<n; i++){
            if(i%2 ==0){
            b.add(a.get(i));
            }else{
            c.add(a.get(i));
            }
        }
        
        Collections.reverse(c);
        
        for(int i=0;i<c.size(); i++){
            System.out.print(c.get(i)+" ");
        }
        for(int i=0;i<b.size(); i++){
            System.out.print(b.get(i)+" ");
        }
        }else{
        for(int i=0; i<n; i++){
            if(i%2 == 0){
            b.add(a.get(i));
            }else{
            c.add(a.get(i));
            }
        }
        Collections.reverse(b);
        
        for(int i=0;i<b.size(); i++){
            System.out.print(b.get(i)+" ");
        }
        for(int i=0;i<c.size(); i++){
            System.out.print(c.get(i)+" ");
        }
        }

    }
}