import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Item> pmap;
    static HashMap<String, Integer> fmap;
    public static void main(String[] args){
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n!=0){
		solve(n);
	    }
	}
    }

    static void solve(int n){
	//テ・ツ?・テ・ツ環崚ィツェツュテ」ツ?ソティツセツシテ」ツ?ソテ」ツ?禿」ツ?禿」ツ?凝」ツつ?
	pmap = new HashMap<String, Item>();
	fmap = new HashMap<String, Integer>();
	int i, j;
	for(i=0; i<n; i++){
	    String name = sc.next();
	    int price = sc.nextInt();
	    pmap.put(name, new Item(name, price));
	}
	int m = sc.nextInt();
	for(i=0; i<m; i++){
	    String name = sc.next();
	    int k = sc.nextInt();
	    String[] r = new String[k];
	    for(j=0; j<k; j++){
		r[j] = sc.next();
	    }
	    if(pmap.containsKey(name)){
		pmap.get(name).setRecipe(r);
	    }
	    else{
		Item item = new Item(name, -1);
		item.setRecipe(r);
		pmap.put(name, item);
	    }
	}
	//テ・ツ?・テ・ツ環崚ィツェツュテ」ツ?ソティツセツシテ」ツ?ソテ」ツ?禿」ツ?禿」ツ?セテ」ツ?ァ

	String x = sc.next();
	int ans = search(x);
	System.out.println(ans);
    }


    static int search(String name){
	//System.out.println(name);
	if(pmap.containsKey(name) && pmap.get(name).getRecipe()!=null){
	    if(fmap.containsKey(name))
		return fmap.get(name);  //テヲツ慊?・ツョツ嘉・ツ?、テァツ「ツコテ・ツョツ堙ヲツクツ?
	    else{
		String[] r = pmap.get(name).getRecipe();
		int res = 0;
		int i;
		for(i=0; i<r.length; i++){
		    res += search(r[i]);
		}
		if(pmap.get(name).getPrice()!=-1){
		    res = Math.min(res, pmap.get(name).getPrice());
		}
		fmap.put(name, res);
		return res;
	    }
	}
	else if(pmap.containsKey(name)){
	    int res = pmap.get(name).getPrice();
	    fmap.put(name, res);
	    return res;
	}
	else{
	    //System.out.println("テ」ツつィテ」ツδゥテ」ツδシ");
	    return -1/0;
	}
    }
}

class Item{
    String name;
    int price;
    String[] recipe;
    public Item(String n, int p){
	name = n;  price = p;
    }
    public void setRecipe(String[] r){
	recipe = r;
    }
    public String[] getRecipe(){
	return recipe;
    }
    public int getPrice(){
	return price;
    }
}
			