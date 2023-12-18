import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] strs = split(s.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(String str : strs)
        {
            int len = str.length();
            if(2 < len && len < 7) set.add(str);
        }
        System.out.println(join(set));

    }
    static String join(Iterable<?> v)
    {
        Iterator<?> itr = v.iterator();
        if(!itr.hasNext()) return "";
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            sb.append(itr.next());
            if(!itr.hasNext()) return sb.toString();
            sb.append(' ');
        }
    }

    static String[] split(String s)
    {
    	LinkedList<String> list = new LinkedList<String>();
    	s = s.replace(',', '.');
    	s = s.replace('.', ' ');
    	StringTokenizer sz = new StringTokenizer(s, " ");
    	while(sz.hasMoreTokens())
    	{
    		list.add(sz.nextToken());
    	}
    	return list.toArray(new String[0]);
    }
}