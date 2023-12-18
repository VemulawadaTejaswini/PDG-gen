import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Map<Character,String> map = new HashMap<Character,String>();
        mapset(map);
        
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            String testcase = scan.next();
            
            int start=0,pos=0,count=0,num=0;
            String ans="",tmp;
            char button;
            do{
                pos = testcase.indexOf("0",start);
                if(start!=pos)
                {
                    button = testcase.charAt(start);
                    count = pos-1-start;
                    if(button=='1')
                        num = count%5;
                    else if(button=='7' || button=='9')
                        num = count%4;
                    else
                        num = count%3;
                
                    tmp=map.get(button);
                    ans=ans+tmp.substring(num,num+1);
                }
                start=pos+1;
            }while(testcase.length()>start);
            
            System.out.println(ans);
        }    
    }
        
    public static void mapset(Map<Character,String> map)
    {
        map.put('1',".,!? ");   //5文字
        map.put('2',"abc");     //3文字
        map.put('3',"def");     //3文字
        map.put('4',"ghi");     //3文字
        map.put('5',"jkl");     //3文字
        map.put('6',"mno");     //3文字
        map.put('7',"pqrs");    //4文字
        map.put('8',"tuv");     //3文字
        map.put('9',"wxyz");    //4文字
    }
}