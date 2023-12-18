import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String rightFoot = "d"; // d??????¨????????????
        String leftFoot = "d";
        String nextFoot = "x";
        String nextMove = "x";
        String beforeStat = "d"; // false????????????°??????
        int count = 0;
 
        while(true){
            int n = sc.nextInt();
            if (n==0){
                break;
            }
            for(int i=0;i<n;i++){
                String buffer = sc.next();
                nextFoot=buffer.substring(0,1);
                nextMove=buffer.substring(1,2);
 
                if(nextFoot=="r" && nextMove=="u"){
                    rightFoot = "u";
                }
                else if(nextFoot=="r" && nextMove=="d"){
                    rightFoot = "d";
                }
                else if(nextFoot=="l" && nextMove=="u"){
                    leftFoot = "u";
                }
                else if(nextFoot=="l" && nextMove=="d"){
                    leftFoot ="d";
                }
 
                if(rightFoot==leftFoot&&(!rightFoot.equals(beforeStat))){
                    // ?????¶????¨?????¶?????????????????????????????????????¶??????¨???°?????????´???
                    count ++;
                    if(beforeStat=="d"){
                        beforeStat="u";
                    }
                    else{
                        beforeStat="d";
                    }
                }
            }
            System.out.println(count);
 
        }
    }
 
}