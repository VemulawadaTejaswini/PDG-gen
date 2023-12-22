import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hp = Integer.parseInt(sc.next());
        int attack = Integer.parseInt(sc.next());
        if(hp % attack != 0){
            System.out.println(hp / attack + 1);
        }else{
            System.out.println(hp / attack);
        }
    }
}