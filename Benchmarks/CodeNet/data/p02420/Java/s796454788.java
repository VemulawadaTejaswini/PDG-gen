import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s;
        int m;
        int i;
        Deck d=new Deck();
        while(!(s=sc.next()).equals("-")){
            d.setDeck(s);
            m=sc.nextInt();
            for(i=0;i<m;i++){
                d.shuffle(sc.nextInt());
            }
            d.printDeck();
        }
    }
}

class Deck{
    private String str;
    Deck(){
    }
    void setDeck(String s){
        this.str=s;
    }
    void shuffle(int h){
        this.str=this.str.substring(h,this.str.length())+this.str.substring(0,h);
    }
    void printDeck(){
        System.out.println(this.str);
    }
}
