import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
 
public class Main{
 
    public static void main(String[] args) throws Exception
    {
        String[] strRing = {"24532453","64136413","56215621","51265126","63146314","54235423"};
        String strT,strS,strB;
        int nE=0,nW=0;
        boolean bInsane=false,bSum=false;
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        int n = Integer.parseInt(br.readLine() );// input n
        String[] strValue = br.readLine().split(" ");// input Dice value
 
 
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
 
        for(String strEach : strValue)
        {
            sb.append(strEach);
        }
 
        sb.append(sb);
 
        String strStr = sb.toString();
 
 
        HashMap<String,String> map = new HashMap<String,String>();
 
        for(int i=0; i<6; i++)
        {
            map.put(strValue[i],Integer.toString(i+1) );
        }
 
        for(int i=0; i<n-1; i++)
        {
            String[] str = br.readLine().split(" ");//get 2nd dice
 
    try{
 
            strT = map.get(str[0]);
            strS = map.get(str[1]);
            strB = Integer.toString(7 - Integer.parseInt(strT) );
             
        }catch(NumberFormatException e){
            strB = null;
            strT = null;
            strS = null;
             
        }
 
            String strBST = strB + strS + strT;
 
            for(int j=0; j<6; j++)
            {
                if(-1 < strRing[j].indexOf(strBST) )
                {
                    nE = j;
                    nW = 5-j;
                }
            }
 
            if(strValue[nE].equals(str[2]) && strValue[nW].equals(str[3]) )
            {
                int nB = Integer.parseInt(strB);
                bInsane = strValue[nB-1].equals(str[5]) ? true : false;
 
//              System.out.println(strValue[nB-1].equals(str[5]) ? "Yes" : "No");
            }
            else
            {
                for(String strEach : str)
                {
                    sb2.append(strEach);
                }
 
                if(-1 < strStr.indexOf(sb2.toString() ) ) bInsane = true;
                else bInsane = false;
//              System.out.println("No");
            }
 
            bSum = bSum | bInsane;
 
            if(bSum)
            {
                System.out.println("No");
                System.exit(0);
            }
 
        }
 
        System.out.println("Yes");
 
    }
}