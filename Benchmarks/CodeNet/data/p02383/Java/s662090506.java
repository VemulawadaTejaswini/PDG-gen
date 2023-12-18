import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] dRew = new int[4];
        int[] dRns = new int[2];
        Integer tmpD=0;
        int[] diceN=new int[6];
        
        for(int i=0; i<6; i++)
            diceN[i]=scan.nextInt();
        
        dRns[0]=diceN[4];
        dRns[1]=diceN[1];
        dRew[0]=diceN[3];
        dRew[1]=diceN[0];
        dRew[2]=diceN[2];
        dRew[3]=diceN[5];
        
        //System.out.println(Arrays.toString(dRew)+"1:"+Arrays.toString(dRns));
        
        
        String command=scan.next();
        for(int i=0; i<command.length(); i++){
            switch(command.substring(i,i+1)){
                case "E":
                    tmpD=dRew[3];
                    dRew[3]=dRew[2];
                    dRew[2]=dRew[1];
                    dRew[1]=dRew[0];
                    dRew[0]=tmpD;
                break;
                case "W":
                    tmpD=dRew[3];
                    dRew[3]=dRew[0];
                    dRew[0]=dRew[1];
                    dRew[1]=dRew[2];
                    dRew[2]=tmpD;
                break;
                case "S":
                    tmpD=dRns[0];
                    dRns[0]=dRew[3];
                    dRew[3]=dRns[1];
                    dRns[1]=dRew[1];
                    dRew[1]=tmpD;
                break;
                case "N":
                    tmpD=dRns[0];
                    dRns[0]=dRew[1];
                    dRew[1]=dRns[1];
                    dRns[1]=dRew[3];
                    dRew[3]=tmpD;
                break;
            }
        //System.out.println(dRew+":"+dRns);
        }
        System.out.println(dRew[1]);
        
    }
}
