import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String s = sc.next();
        int len = s.length();
        boolean easyP = true;
        for(int i = 0;i<len;i++){
            if(i%2==0){
                if(s.charAt(i)=='R'||s.charAt(i)=='U'||s.charAt(i)=='D'){
                
                }
                else{
                    easyP = false;
                    break;
                }
        }
        if(i%2!=0){
            if(s.charAt(i)=='L'||s.charAt(i)=='U'||s.charAt(i)=='D'){
                
            }
            else{
                easyP = false;
                break;
            }
        }
        }
        System.out.println(easyP?"Yes":"No");
        }

       
    }
