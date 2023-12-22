import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            a.add(Integer.parseInt(sc.next()));
        }
        
        Collections.sort(a, Comparator.reverseOrder());
        
        int Alice_score = 0;
        int Bob_score = 0;
        int i=0;
        while(a.size() != 0){
            if(i % 2 == 0){
                Alice_score += a.get(0);
            }else{
                Bob_score += a.get(0);
            }
            i++;
            a.remove(0);
        }
        System.out.println(Alice_score - Bob_score);
    }
}