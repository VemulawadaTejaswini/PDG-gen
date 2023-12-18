import java.util.*;
class Main {
    public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

                    String s= sc.next();
                    ArrayList<Integer> res = new ArrayList<>();
                    for(int i=0;i<s.length();i++){

                        if(s.charAt(i)=='R'){
                            int c=0;
                            while( i <= s.length()-1 && s.charAt(i)!='S' ){
                                i++;
                                c++;
                            }
                            res.add(c);
                            i=i-1;
                        }
                        else{
                            continue;
                        }
                    }

                    int max= Integer.MIN_VALUE;
                    for(int i: res){
                        max=Math.max(max,i);
                    }
                    if(max<0){
                        System.out.println("0");
                    }
                    else
                    System.out.println(max);
                }
            }