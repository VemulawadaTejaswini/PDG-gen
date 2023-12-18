import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> Array = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            List<Integer> array = new ArrayList<>();
            Array.add(array);
        }
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            
            if(a == 0){
                int t= sc.nextInt();
                int x = sc.nextInt();
                Array.get(t).add(x);
            }else if(a == 1){
                int t = sc.nextInt();
                if(Array.get(t).size() != 0)
                System.out.println(Array.get(t).get(0));
            }else{
                int t = sc.nextInt();
                if(Array.get(t).size() != 0)
                Array.get(t).remove(0);
        	}
        }
    }
}
