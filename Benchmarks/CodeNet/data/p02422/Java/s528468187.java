import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //文字列
        String str = sc.next();
        //命令数
        int n = Integer.parseInt(sc.next());

        for(int i=0; i<n; i++){
            //命令
            String order = sc.next();
            //a文字目
            int start = Integer.parseInt(sc.next());
            //b文字目
            int end = Integer.parseInt(sc.next());
            //命令がprintの場合
            if(order.equals("print")){
                System.out.println(print(str,start,end));
            }
            //命令がreverseの場合
            if(order.equals("reverse")){
                str = reverse(str,start,end);
            }
            //命令がreplaceの場合
            if(order.equals("replace")){
                //置換する文字
                String word = sc.next();
                str = replace(str,start,end,word);
            }
        }

    }
    //print
    public static String print(String str,int start, int end){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            if(start <= i && i <= end){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
    //reverse
    public static String reverse(String str,int start, int end){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            if(start <= i && i <= end){
                sb.append(str.charAt(start+end-i));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //replace
    public static String replace(String str,int start, int end,String word){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < str.length(); i++){
            if(start <= i && i <= end){
                sb.append(word.charAt(i-start));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();        
    }    

}

