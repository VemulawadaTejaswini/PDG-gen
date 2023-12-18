import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<Integer> dRew=new ArrayList<Integer>();
        List<Integer> dRns=new ArrayList<Integer>();
        Integer tmpD=0;
        int comN,com1,com2;
        int[] diceN=new int[6];
        
        for(int i=0; i<6; i++)
            diceN[i]=scan.nextInt();
        
        dRns.add(diceN[4]);
        dRns.add(diceN[1]);
        dRew.add(diceN[3]);
        dRew.add(diceN[0]);
        dRew.add(diceN[2]);
        dRew.add(diceN[5]);
        
        //System.out.println(dRew+":"+dRns);
        
        comN=scan.nextInt();
        for(int i=0; i<comN; i++){
            com1=scan.nextInt();
            com2=scan.nextInt();
            
            if(dRns.indexOf(com1)!=-1){
                System.out.println(dRew.get((dRew.indexOf(com2)+(dRns.indexOf(com1)==0?1:3))%4));
            }
            else if(dRns.indexOf(com2)!=-1){
                System.out.println(dRew.get((dRew.indexOf(com1)+(dRns.indexOf(com2)==1?1:3))%4));
            }
            else{
                System.out.println(dRns.get((dRew.indexOf(com1)-dRew.indexOf(com2)+4)%4==1?1:0));
            }
            
        }
    }
}
