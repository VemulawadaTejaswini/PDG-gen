import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Integer> m  = new ArrayList<>();
        List<Integer> f  = new ArrayList<>();
        List<Integer> r  = new ArrayList<>();
        
        int count = 0;
        
        while(true){
            m.add(sc.nextInt());
            f.add(sc.nextInt());
            r.add(sc.nextInt());
            
            if(m.get(count) == -1 && f.get(count) == -1 && r.get(count) == -1) break;
            
            count++;
        }      
        
        for(int i=0; i<m.size()-1; i++){
            if(m.get(i) == -1  || f.get(i) == -1){
                System.out.println("F");
            }else if(m.get(i) + f.get(i) >= 80){
                System.out.println("A");
            }else if(m.get(i) + f.get(i) >= 65 ){
                System.out.println("B");
            }else if(m.get(i) + f.get(i) >= 50 ){
                System.out.println("C");
            }else if(r.get(i) >= 50){
                System.out.println("C");
            }else if(m.get(i) + f.get(i) >= 30 ){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
            
        }
    }
}



