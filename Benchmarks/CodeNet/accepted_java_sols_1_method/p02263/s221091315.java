import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        ArrayList<Integer> operand=new ArrayList<Integer>();
        String command=scan.nextLine();
        String[] com1=command.split(" ",0);
        int osize, comsize=1;
        
        for(int i=0; command.indexOf(" ",i)!=-1; i=command.indexOf(" ",i)+1){
            comsize++;
        }
        //System.out.println(comsize+":"+Arrays.toString(com1));
        
        for(int i=0; i<comsize; i++){
            osize=operand.size();
            //System.out.println(com1[i]);
            if(com1[i].charAt(0)<'0'){
                switch(com1[i].charAt(0)){
                    case '+':
                        operand.set(osize-2,operand.get(osize-2)+operand.remove(osize-1));
                    break;
                    case '-':
                        operand.set(osize-2,operand.get(osize-2)-operand.remove(osize-1));
                    break;
                    case '*':
                        operand.set(osize-2,operand.get(osize-2)*operand.remove(osize-1));
                    break;
                }
            }else{
                operand.add(Integer.parseInt(com1[i]));
            }
            //System.out.println(operand.size()+":"+operand);
        }
        System.out.println(operand.get(0));
    }
}
