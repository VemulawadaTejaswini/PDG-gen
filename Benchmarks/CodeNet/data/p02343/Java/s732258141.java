
import java.util.*;
public class Main {

    private static List<Set<Integer>> setList = new ArrayList<Set<Integer>>();
    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int query = s.nextInt();

        //初期セット完了
        //命令処理開始
        for(int i=0;i<query;i++)
        {
            boolean result=false;
            switch(s.nextInt())
            { 
                case 0:
                    result = unite(s.nextInt(),s.nextInt());
                break;
                case 1:
                    result = same(s.nextInt(),s.nextInt());
                    System.out.println(result?1:0);
                break; 
            }
        }
    }
    private static boolean unite(int x,int y)
    {
        Set<Integer> xSet =null;
        Set<Integer> ySet =null;
        for(Set<Integer> tmpSet:setList)
        {
            //xが含まれているか？
            if(tmpSet.contains(x))
            {
                xSet = tmpSet;
                if(ySet!=null)
                {
                    break;
                }
            }
            //yが含まれているか？
            if(tmpSet.contains(y))
            {
                ySet = tmpSet;
                if(xSet!=null)
                {
                    break;
                }
            }
        }
        if(xSet==null&&ySet==null)
        {
            Set<Integer>tmpHashSet = new HashSet<Integer>();
            tmpHashSet.add(x);
            tmpHashSet.add(y);
            setList.add(tmpHashSet);
            return true;
        }
        if(xSet==null){
            ySet.add(x);
            return false;
        }
        if(ySet==null){
            xSet.add(y);
            return false;
        }
        if(xSet.equals(ySet))return false;
        //xSetもySetもnullではない
        xSet.addAll(ySet);
        setList.remove(ySet);
        return true;
    }
    private static boolean same(int x,int y)
    {
        for(Set<Integer> tmpSet:setList)
        {
            //xが含まれているか？
            if(tmpSet.contains(x))
            {
                if(tmpSet.contains(y))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }
}
