import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Map<String,Integer> map =new HashMap<>();
        Scanner  sc =new Scanner(System.in);
        map.put("400-599",8);
        map.put("600-799",7);
        map.put("800-999",6);
        map.put("1000-1199",5);
        map.put("1200-1399",4);
        map.put("1400-1599",3);
        map.put("1600-1799",2);
        map.put("1800-1999",1);
        int n = sc.nextInt();
        for(Map.Entry<String,Integer> map1:map.entrySet())
        {
            String str = map1.getKey();
            String chr[] = str.split("-");
            int start = Integer.parseInt(chr[0]);
            int end = Integer.parseInt(chr[1]);
            if(n>=start && n<=end)
            {
                System.out.println(map1.getValue());
                break;
            }
        }
    }
}