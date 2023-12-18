import java.util.*;

class Main{
    public static void main(String[] args){
        List<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++){
            int q = sc.nextInt();
            
            if(q == 0){
                int x = sc.nextInt();
                array.add(x);
            }else if(q == 1){
                int x = sc.nextInt();
                System.out.println(array.get(x));
            }else{
                array.remove(array.size() - 1);
            }
        }
    }
}
