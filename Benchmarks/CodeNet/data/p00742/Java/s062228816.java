import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int[] count = new int[26]; //eAt@xbgÌdÝðßé
			boolean[] flg = new boolean[26]; //eAt@xbgªPêÌæªÉ é©ÌtO
			boolean[] ap = new boolean[26]; //eAt@xbgªPêÉ»ê½©Ç¤©ÌtO
			int m = 0; //üÍÉo»µ½At@xbgÌíÞ

			for(int i=0;i<n;i++){
				char[] s = sc.next().toCharArray();
				int len = s.length;

				if(len != 1) flg[s[0]-'A'] = true; //1¶ÅÈ¢Àè,0ÉµÄÍ¢¯È¢At@xbg
				for(int j=0;j<len;j++){
					if(!ap[s[j]-'A']){
						m++;
						ap[s[j]-'A'] = true;
					}

					if(i == n-1)
						count[s[j]-'A'] -= Math.pow(10,len-j-1);
					else
						count[s[j]-'A'] += Math.pow(10,len-j-1);
				}
			}

			w = new int[m]; //countzñÌKvÈvf¾¯æèoµ½zñ
			initFlg = new boolean[m]; //flgzñÌKvÈvf¾¯æèoµ½zñ
			int j = 0;

			for(int i=0;j<m;i++){
				if(ap[i]){
					w[j] = count[i];
					initFlg[j++] = flg[i];
				}
			}

			//uv->gpµ½(rbgÇ)->o»ñvÌ}bv
			map = new HashMap<Integer,HashMap<Integer,Integer>>();

			//wzñÌæªm/2ÂªÌSTõðs¢,mapÉñ
			topDown(m/2,0,0,0);
			//wzñÌãë¼ªðSTõµ,topDownÆÌdÈèªÈ¢©T·
			System.out.println(bottomUp(m%2==0?m/2:m/2+1,m-1,0,0));
		}
	}

	private static int[] w;
	private static boolean[] initFlg;
	private static HashMap<Integer,HashMap<Integer,Integer>> map;

	private static void topDown(int rem,int idx,int sum,int used){
		if(rem == 0){
			if(map.containsKey(sum)){
				if(map.get(sum).containsKey(used)){
					//·ÅÉo½±ÆÌ ép^[ÈçÎ,JEgÉvXP
					map.get(sum).put(used,map.get(sum).get(used)+1);
				}
				else{
					//Ü¾o½±ÆÌÈ¢p^[ÈçÎ,JEgÍP
					map.get(sum).put(used,1);
				}
			}
			else{
				map.put(sum,new HashMap<Integer,Integer>());
				map.get(sum).put(used,1);
			}

			return;
		}

		for(int i=initFlg[idx]?1:0;i<10;i++){
			if((used&(1<<i)) == 0){
				topDown(rem-1,idx+1,sum+w[idx]*i,(used|(1<<i)));
			}
		}
	}

	private static int bottomUp(int rem,int idx,int sum,int used){
		int res = 0;

		if(rem == 0){
			//L[ÆµÄ(-v)ªÈ¯êÎJEg=0
			if(!map.containsKey(-sum)) return 0;
			for(int tmp : map.get(-sum).keySet()){
				//topDownÅgpµ½Æ©ÔÁÄÈ¯êÎJEg·é
				if((tmp & used) == 0){
					res += map.get(-sum).get(tmp);
				}
			}
			return res;
		}

		for(int i=initFlg[idx]?1:0;i<10;i++){
			if((used&(1<<i)) == 0){
				res += bottomUp(rem-1,idx-1,sum+w[idx]*i,(used|(1<<i)));
			}
		}
		return res;
	}
}