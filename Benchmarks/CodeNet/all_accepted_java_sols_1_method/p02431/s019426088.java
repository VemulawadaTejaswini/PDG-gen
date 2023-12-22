import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int tmpNum;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            switch(scan.nextInt()){
                case 0:
                    list.add(scan.nextInt());
                    break;
                case 1:
                    System.out.println(list.get(scan.nextInt()));
                    
                    break;
                case 2:
                    list.remove(list.size()-1);
                    break;
            }
            //System.out.println(list);
        }
    }
}
