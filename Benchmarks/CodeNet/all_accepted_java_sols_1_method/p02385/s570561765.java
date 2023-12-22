import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<Integer> dRew=new ArrayList<Integer>();
        List<Integer> dRns=new ArrayList<Integer>();
        List<Integer> d2Rew=new ArrayList<Integer>();
        List<Integer> d2Rns=new ArrayList<Integer>();
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
        
        for(int i=0; i<6; i++)
            diceN[i]=scan.nextInt();
        
        d2Rns.add(diceN[4]);
        d2Rns.add(diceN[1]);
        d2Rew.add(diceN[3]);
        d2Rew.add(diceN[0]);
        d2Rew.add(diceN[2]);
        d2Rew.add(diceN[5]);
        
        //System.out.println(dRew+"1:"+dRns);
        //System.out.println(d2Rew+"2:"+d2Rns);
         String command="EEEENEEENEEESEEESEEENEEE";
        for(int i=0; i<command.length(); i++){
            switch(command.substring(i,i+1)){
                case "E":
                    tmpD=dRew.remove(3);
                    dRew.add(0,tmpD);
                break;
                case "W":
                    tmpD=dRew.remove(0);
                    dRew.add(tmpD);
                break;
                case "S":
                    tmpD=dRns.get(0);
                    dRns.set(0,dRew.get(3));
                    dRew.set(3,dRns.get(1));
                    dRns.set(1,dRew.get(1));
                    dRew.set(1,tmpD);
                break;
                case "N":
                    tmpD=dRns.get(0);
                    dRns.set(0,dRew.get(1));
                    dRew.set(1,dRns.get(1));
                    dRns.set(1,dRew.get(3));
                    dRew.set(3,tmpD);
                break;
            }
          //  System.out.println(dRew+":"+dRns);
            if(dRew.equals(d2Rew)&&dRns.equals(d2Rns)){
                System.out.println("Yes");
                return;
            }
        }
        //System.out.println(dRew.get(1));
        
            System.out.println("No");
    }
}
