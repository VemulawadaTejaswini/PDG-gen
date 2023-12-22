import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int N = Integer.parseInt(SC.next());
        HashSet<String> HS = new HashSet<String>();
        for(int i=0;i<N;i++){
            HS.add(SC.next());
        }

        System.out.println(HS.size());
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
