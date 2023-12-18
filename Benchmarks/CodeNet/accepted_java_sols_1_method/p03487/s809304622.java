import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Map<Integer,Integer>map=new HashMap<>();
for(int i=0;i<n;i++){
    int a=sc.nextInt();
    if(map.containsKey(a))
        map.put(a,map.get(a)+1);
    else
        map.put(a,1);
}
int ans=0;
for(Integer key:map.keySet())
    if(key.compareTo(map.get(key))>0)ans+=map.get(key);
    else ans+=map.get(key)-key;
System.out.println(ans);
}
}