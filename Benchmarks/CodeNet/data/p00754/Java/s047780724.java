import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] strings={"([",")]"};
        while(true){
            String input=scan.nextLine();
            ArrayList<Integer> list=new ArrayList<Integer>();
            if(input.equals(".")){
                break;
            }
            boolean flag=true;
            for(int i=0;i<input.length();i++){
                for(int j=0;j<strings[0].length();j++){
                    if(input.charAt(i)==strings[0].charAt(j)){
                        list.add(j);
                        // System.out.println("[add]i="+i+":j="+j+":size="+list.size());
                    }
                    else if(input.charAt(i)==strings[1].charAt(j)){
                        // System.out.println("[deleat]i="+i+":j="+j+":size="+list.size());
                        if(list.get(list.size()-1)==j){
                            list.remove(list.size()-1);
                        }
                        else{
                            i=input.length();
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
