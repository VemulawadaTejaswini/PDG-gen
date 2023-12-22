import java.util.*;

public class Main{
    public static void main(String [] args){
        int n,m=0;
        Scanner sc = new Scanner(System.in);
        String st;
        String kiridasi;
        String kiridasi1;
        String kiridasi2;
        st=sc.nextLine();   //文字列格納
        String[] list=st.split(""); //文字列から配列へ
        ArrayList<String> str2=new ArrayList<String>();//list str2を作った
        for(int i=list.length-1;i>=0;i--){
            str2.add(list[i]);              //str2の中へ逆文字列を配列として格納
        }
        kiridasi =String.join("",str2);//連結メソッドjoin 使用 文字列へと戻す
        n=(list.length-1)/2;
        m=(list.length+3)/2;
        String a = st.substring(0,n);
        String b = st.substring(m-1,list.length);
        ArrayList<String> str3=new ArrayList<String>();
        ArrayList<String> str4=new ArrayList<String>();
        for(int k=0;k<n;k++){
                str3.add(list[k]);
        }
        kiridasi1=String.join("",str3);
        for(int l=0;l<n;l++){
                str4.add(list[l]);
        }
        kiridasi2=String.join("",str4);
        if(st.equals(kiridasi) && kiridasi1.equals(a) && kiridasi2.equals(b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}