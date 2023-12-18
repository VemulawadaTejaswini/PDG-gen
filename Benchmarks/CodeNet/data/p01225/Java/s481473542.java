import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static final int countMax = 30;


	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		int a = Integer.parseInt(input(1)[0]);
		for(int i = 0; i < a; i++)
		{
			String[][] str = {input(9), input(9)};
			char[][] c = new char[9][9];
			for(int j = 0; j < 9; j++)
			{
				c[0][j] = str[0][j].toCharArray()[0];
				c[1][j] = str[1][j].toCharArray()[0];
			}
			QuickSort(c[0], 0, 8, c[1]);
			boolean[] b = {false, false, false, false, false, false, false, false, false};
			System.out.println(checkWin(c, 0, 0, 0, b) ? "1" : "0");
		}
	}

	public static boolean checkWin(char[][] str, int num, int select, int select2, boolean[] b)
	{
		boolean b2 = false;
		//if(num % 3 == 2) System.err.print("| " + str[0][select] + " " + str[0][select2] + " ");
		if(num % 3 == 0)
		{
			for(int i = 0; i < 9; i++)
			{
				if(b2) return true;
				//if(num == 0) System.out.println(i);
				if(b[i]) continue;
				b[i] = true;
				b2 = checkWin(str, num + 1, i, 0, b);
				b[i] = false;
			}
		}
		else if(num % 3 == 1)
		{
			for(int i = 0; i < 9; i++)
			{
				if(b[i]) continue;
				for(int j = -1; j < 2; j++)
				{
					if(b2) return true;
					if(str[0][select] == str[0][i] + j && str[1][select] == str[1][i])
					{
						b[i] = true;
						b2 = checkWin(str, num + 1, select, i, b);
						b[i] = false;
					}
				}
			}
		}
		else if(num % 3 == 2)
		{
			for(int i = 0; i < 9; i++)
			{
				if(b[i]) continue;
				for(int j = -1; j < 2; j++)
				{
					if(b2) return true;
					if(num == 8)
					{
						//if(str[0][select] == '5')System.err.println(str[0][i] + " " + str[0][select2] + " " + j);
						if(str[0][select] == str[0][i] + j && str[1][select] == str[1][i])
						{
							if((j == 0 && str[0][select2] == str[0][i]) || (j != 0 && str[0][select2] != str[0][i])) return true;
						}
						if(str[0][select2] == str[0][i] + j && str[1][select2] == str[1][i])
						{
							if((j == 0 && str[0][select] == str[0][i]) || (j != 0 && str[0][select] != str[0][i])) return true;
						}
					}
					else
					{
						if(str[0][select] == str[0][i] + j && str[1][select] == str[1][i])
						{
							if((j == 0 && str[0][select2] == str[0][i]) || (j != 0 && str[0][select2] != str[0][i]))
							{
								//System.err.println(str[0][i] + " " + num + " " + j);
								b[i] = true;
								b2 = checkWin(str, num + 1, 0, 0, b);
								b[i] = false;
							}
						}
						if(str[0][select2] == str[0][i] + j && str[1][select2] == str[1][i])
						{
							if((j == 0 && str[0][select] == str[0][i]) || (j != 0 && str[0][select] != str[0][i]))
							{
								//System.err.println(str[0][i] + " " + num + " " + j);
								b[i] = true;
								b2 = checkWin(str, num + 1, 0, 0, b);
								b[i] = false;
							}
						}
					}
				}
			}
		}
		return b2;
	}

	public static int loop(int num, int sum, int max, boolean[] b, int now, int upper)
	{
		int a = num;
		if(max == now)
		{
			int c = 0;
			for(int i = 0; i < 10; i++)
			{
				if(b[i]) c += i;
			}
			for(int i = upper; i < 10; i++)
			{
				if(b[i]) continue;
				if(c + i == sum)
				{
					//System.err.println(sum + " " + c + " " + i);
					a++;
				}
			}
		}
		else
		{
			for(int i = upper; i < 10; i++)
			{
				if(b[i]) continue;
				b[i] = true;
				a = loop(a, sum, max, b, now + 1, i);
				b[i] = false;
			}
		}
		return a;
	}

	public static int[] toIntArray(int a)
	{
		int b[] = new int[8];
		for(int i = 0; i < 8; i++)
		{
			b[i] = (a >> (i * 3) & 0b111);
		}
		return b;
	}

	public static int toInt(int[] a)
	{
		int b = 0;
		for(int i = a.length - 1; i >= 0; i--)
		{
			b = b << 3;
			b+=a[i];
		}
		return b;
	}

	public static int toInt(Integer[] a)
	{
		int b = 0;
		for(int i = a.length - 1; i >= 0; i--)
		{
			b = b << 3;
			b+=a[i];
		}
		return b;
	}

	static void QuickSort(int[] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2];
		int l = left, r = right, tmp;
		while(l<=r) {
			while(d[l] < p) { l++; }
			while(d[r] > p) { r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++; r--;
			}
		}
		QuickSort(d, left, r);
		QuickSort(d, l, right);
    }

	static void QuickSort(char[] d, int left, int right, char[] c) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2];
		int l = left, r = right;
		char tmp;
		while(l<=r) {
			while(d[l] < p) { l++; }
			while(d[r] > p) { r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				tmp = c[l]; c[l] = c[r]; c[r] = tmp;
				l++; r--;
			}
		}
		QuickSort(d, left, r, c);
		QuickSort(d, l, right, c);
    }

	public static boolean SeparateSearch(int[] a, int b, int first, int end)
	{
		if(end - first <= 1)
		{
			if(a[first] == b) return true;
			else if(a[end] == b) return true;
			else return false;
		}
		else
		{
			int temp = (end + first) / 2;
			if(a[temp] == b) return true;
			else if(a[temp] < b) return SeparateSearch(a, b, temp, end);
			else return SeparateSearch(a, b, first, temp);
		}
	}

	public static int GCD(int x, int y)
	{
		int z = Math.max(x, y) % Math.min(x, y);
		if(z == 0) return Math.min(x, y);
		return GCD(z, Math.min(y, x));
	}

	public static int SelectionSort(int a[])
	{
		int Select = 0;
		for(int j = 0; j < a.length - 1; j++)
		{
			int[] min = {0, Integer.MAX_VALUE};
			for(int i = j; i < a.length; i++)
			{
				if(min[1] > a[i])
				{
					min[1] = a[i];
					min[0] = i;
				}
			}
			if(j != min[0])
			{
				Select++;
				swap(a, min[0], j);
			}
		}
		return Select;
	}

	public static int BubbleSort(int a[])
	{
		int swapp = 0;
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i = 0; i < a.length - 1; i++)
			{
				if(a[i] > a[i+1])
				{
					swapp++;
					swap(a, i, i+1);
					flag = true;
				}
			}
		}
		return swapp;
	}

	public static void swap(int[] a, int x, int y)
	{
		a[x] = a[x] ^ a[y];
		a[y] = a[x] ^ a[y];
		a[x] = a[x] ^ a[y];
	}

	public static String[] inputOne() throws IOException
	{
		String str2 = br.readLine();
		String[] str = new String[str2.length()];
		for(int i = 0; i < str.length; i++)
		{
			if(i < str.length - 1)
			{
				str[i] = str2.substring(i, i+1);
			}
			else
			{
				str[i] = str2.substring(i);
			}
		}
		return str;
	}

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		String str2 = br.readLine();
		int j = 0;
		for(int i = 0; i < Num; i++)
		{
			if(i < Num - 1)
			{
				str[i] = str2.substring(j, str2.indexOf(" ", j));
				j = str2.indexOf(" ", j) + 1;
			}
			else
			{
				str[i] = str2.substring(j);
			}
		}
		return str;
	}
	//*/

	/*

`           `            ```.(-~_````````````....-_~(?><___-``````````````.`````````````````````..__.~~~~~~~~~jI==lOXx.        ```
`` `  `    `               .z<```````````..`.....~(+=>>>:~<<;___. ```````````````````````````...``-(_.~~~~~~~~(w===lOUI<.
` ` `` `  `    `      `  .(!```````````````.``..~(?z>><!~``_~~~;<<-- ``````````````````````````._.`-<_.~~~~~~~:zz==zOzWOl
`  ` `  `   `   ` ` `  .(! `````````````````...-(??;<`` ` `  `  _~<<+<-.````````.````.``````````..-._+_~~~~~::~(I==?OwOXk:
`` ` `     `  `   `   -!``````````````````````._+==1-.```````` `   _~<<<+-....```.`````````````.``_~~(<_~~::::::zz1==wwrXX;`
` ``` ` `    `   `  .<_``.``````````````` ` ``.(==lll&-``` `` ``````` _~(<1z-__..``.`````.``````..`_~~+<~~::::::(I+lOzkvvXk.
` `  `   `    `  `.(!. _``````````````  `  ``` (=lttttO-``````` ` `````` _~<1Oz+--..````` .``````...~~(z_~(;:;;;;O>zttXuzwWn
 ` ` ` `   `     _~_..~```````````` ```` `````_+lltrrtlz_` `` ```` ` ` ```` _~?Ozwo-....` .~ `````.._~(=<_~;;>>>>z?ztOZuuuXW{`
  ` ` ` `  `   .!..-(!`````````````` ` ````_-._ltrrrrrlw>``````` `` ``````````._?1zO+_...`-~_.````..-~~+z<:<>>>>>l?ztzVuuuuXR_
    `  `    `.~~.._(> ````````````` ` ` ` ._(1_<zvrrvvwrI_```````````` `````````` _<1z<_~_._(< ````.-~~;zz<<>>>>?=?=tzWZuuuuXl
 `` ``  ` ` .<_..(zv_````` ```` .` `````._(z+zOz+OOvOwOvI__ ``````````````````````` _1+;<___:;< ```._~_:+O<<>>???===tlXyZzuZyk.`
 ` ` `` ` `.>~_.(zv<_`  ` ```` ~ `` ```._;+I~~_...~~~_~~1<~_-`````````````````````.`._<11?<.(<>_.`.._~(:;zz>????===lllXVXuuyyXl
  `   `  `.>~~~_zI<_``` `````-~_`` ``` _;<<<~~~........_(<_~_.``` .`````````````.`..`.-(1=?<~<z;_..._::<:+Z>?>???===llXykuuXVVk.
` ` ` ` `.<~~~_jI<~_  ``  ``.__` ``  `.<<:~~~...........~(<_:<_.``._``````````.``.`....-(l==<(1<>_..~~:><;zz????===lllXfkzuXffW[ `
 ` ` ` `.<::~(<dZ<~_ `  ``` (<_`  ```._::~~~....```````.__<<:<<_...-_.. ````.``..`.`...._1Ozz_+z+z_.~~:<<;+I????===llOWpHzuXfWkH
 `      (;:(;;juC~~  `` ```_:~`` ```._::~~~....``````````._<>;<z-...(-~__..`.............(zOt<(O>1>~_:;>?>>z????===llOWkHzXfpWqH;`
  ` `  .;;;+>juZ<(<` ``` ` (<_  ````_~::~~~...````````````._<>>1<_-._1-_<_..`............_<OzI:Oz+O_~(>;???1z?====lltwWkHuWpbqqHb`
     ` (;;;+?yuI~+~```````.(~~   `` ~~:~~....`.````````````._:;+z<<_.(G-(>-__.`........~..(1ww<zO<jI~(>>????==?==llttdkkSwWkqmmHM-
      .z>?>1zuZ>(I_``.``` _:~_` ` `.~::~...````````````````` _><1z><_.jk:<1+___...~~~~.~~..<zzI+wz+X<<?>>????======ttdkbSdWqH@gg@k
 `  ``(v???jZuI;zI........_::_```` _:::~...`````````````````` <<_+11<__Oc:<+z+<__~.~~~~~~~~_1wwzzI<dI;+>>?>????===lOzWbWXXqH@@@@@g
      jI==?dXuI+wI~~~~~~~~~::_```` (:<<~..`.````````````` ````-1__<+w<:<O<:;+zz+:~~~~~~~~~_~(wvI?z>dXz>>>?????====zIdWkSwWHM@@@@@@
      Oll=1XZk<zyI:~::::~::::_````-;>><~.```.````````` ``````` (>.__?111zO<>_<zrw+<;<_::((<_(OvO=<;zXO<;<>>????===zzdkWXW@@@@@@@@@
      ZlllzyyI?dV0;:;::::::;;__..._;>><..`.````.``````` ``  ``` >  ..dX0OlI<<::?OXO=??<;;;;::zvtz<:zvvI;<?>>???==zI>XWXWg@@@gggggg
      ZttldVZZzXf0z>>>;;;::;1<_..._;>><_..`...`````````` `` `   (HW9!___+Xwc~_~<<jXAOz>>;;:;;+wOz<_ztwI;;>>>>????l<jHWH@ggggggggH@
      OtttdfyXvXVkO??>>>>>;>+O<~~~_;>?<<__--....```` ` ` `````.J9<` ``. _1Zk+.._+<+wXXz>1&+<;+zOO>_zZzZ>;;;>>>???1>jHkHH@@@@HMMMHY
      zrrrdVWXwXyWO????>>>>>>zz_~~~;+<<~__~<?11z+-```````  `````  ``````._<OU&(jggggHmmmewy<?zz<<! (<+O>;;;>>>>>???dkkkbbHHHHkSvI(
    ` jrrrXy0XuZZVk=????>??>>+rz:~~<?<~` ..._(((><_`````````  ``` ``...-(jWNMMMMMMMMMMMMBMHMNm<_``` <>1<;;;;>;;>+1jgHkkkkWkWHHwvz1
     `(trrXyVzuZZXW==?>>>?=?>>OO+::(1+((--(-__(1z_:_`````````` ````..-JdHWMMMNNMHHHHMYWB>_vM##v_...-<z+z;;;;;;:;>+dBTTUWWWUXHHzOwZ
      .OrrwZCzuZZZWc1z>>>>1z>?ztl+_:dWWMMHHMMMNmg&+-.```` ````````` -dUC<~zHMMM@gg@@@N+.; (VU=_...._(?>=>;;;;;::+z>~(rwXC<jMMN<1wZ
       jrrXk>(ZZZZX$<Oz>>>?l<<lltz+:<OOCz+<d#M@MM#M8:`````` ````````` `   (WHH@@@g@@@@@H: ?<_.`....~(>>1z;:;;;:<zw>~+v<<_(HMMNl_jW
       .zwXk!.XZZZyW<(O>>>>Oz;zlllO<;1z<~(<(MHH@#MI<`````````````````````` 7YTTWHH@@@@H6_..........~<>>jc:;>>;;<zuc~~_..(WMMNNl_+z
        (wXk~ (XXyZWs.jI>>;+w<<Ot=OO;+OA-._-dMM@MMQm,```````````````````` `-((JUHHWXwZC~......~~~~~_+<+zI;>>>>;+wuI~~_~(HM@HNN>.zO
       ` zXW_` <wyZyW_ jz>;;jI:+rz1lz+=wk-..(UWHHMH9!``````` ``` ````````` -(UWkkWWV=~~~~~~~...~..~(<<zr>;>???>jwuC~._(HHHHHHN: (?
     ` ``(Oy_ ` _zWZWl` ?1>;;z+;1tO+1???OZ--.(wkzXWZ!``` ``````````````` ``` `_~~`....~~~~~~~~~~.~_<<(tr<+=????zZOz(JdHHHHHH@N>  ;
          (X}  ` _<?XW;` _<<;+O<:?Oz????<Oz__<<<<!_```````````````````````````````.......~..~.~.._<<(ztr<z=????zXQqHHMHHVHHH@H:
           (k.`     _?Ti ``` ?jwo_<1z<+=>+O<......```````` `````` ``````````````..`.....~.~.~~.._<<~(lrZ+I==?=zwWHHHWUU0Od@@@H_
           `j+       `  __``   1OI_~+z(:;:zz_.``````````````````````````````````.```....~.~~~.._:~.(lOvwO==???dZO<;<1OuuldgH@H_  `
             ?!               `++zz_~<z<::(w:..```````````` ``` ``` ````````````````....~..~_-_::__jOwuuwz????dIw>;++1wuOwHWHH;`
                               (v?><__1z<:(tz_`````````````````` ``` ``````````````.......~.._::~_(wZuZuw<+???z=wI>??=zuOwWXWH}
               `                ?+><<__1z_~1z> ``````` ` ````````````` ````````````......__._::~.(dZZZZuX<+=?1V=z0>???zwOOyuWk$
                            `   +=+?1<__1o_(zw+_``` ` ``` `````````````` `````````....~_(<~_:~~~_dZyyZZuX<>??zw=zX>>?=?zZlXvXWS
                                1==111<~_1z<<zw<_````` `````` ``...``````` `` ```...._(<<~_(~~~_jZyyZZZuZ<>??zw=zXz>?=?=OtdZwX0_
          `                   ` +=lOOl=+_~<1z<zXA+. ``` ````````````````````````..-_(<<:~~(~~_(jyyVyZZyZZ>>??zrz1dI>??=?ztdIzwX:
                  `         `   z=lltrOz+<_(11zwwUX<--.  ` ````````````````````.-_(<::::~~:~_(jXyVVyyZyZZ?>>>Orz+wI>1????zwXzzul
                               .z?=zttOOtzz++<?4kOwwXyXA&-..```````````````` .-(<<<:~~:~:~~_(1wXfVyyZyVXI?>;<ttz;zXz+z????OXI+XI_`
                          `  ``(v>jOzzOOlttltrzzWOtwzZuXyZXwo+-. ````````` .(<<<::~:~_<~~~(<<1wyfyyyZyVkz?>;+zrv;+zz;z?>??zuZ>zw_.
                              .+<:+wXz><1zltlltturwuwXzXX0uuZuuXy+-.`` --(+<<:::~~:~~(<_(<~~~<zyyyyyZyfkz>>;1lwO<<OI<jz>??1wXzzX>.
          `                 ` (<;:+zXkXz>?=lttttwrwuwyzySzuuZZZZuZWA&(J&z<::~:~~:~:~~(_<<~~~~_jZyyyZyZWWz>>>z=Owz;zv><w????zzI1dl~
                  `     `  ``.;;;;1wWHWWkzltrrrvvvzzwZuZXuzzuzuzuuuXXWWS<_~~:~~~~~~__+~~~~~~~~_?WyZuuZZXI??+jO=wI;?zO;jz???zrOzdI~
                         `  .<<>;>zXHMHkkkOOrrvvvvuuXZZZuzvvzwvvuZWUC<_C_~~~~~~:~~~~(<~:~:~~~~:~_TZuzrOX0z>?zOlzX<<1Oz+z??==ztlzS_
                          `.<:;1zzdHHHqqHHkytrrvvvzuuuuuuwrtrrrZ=7!_```-:.~~~~~~~~.(c~~:~~~~~~~~~._?CXuwrz>>?tO=zO<<zOz1????=OzzS;
          `       `   ` ` .+:(uQkWHqqqH@@@HHwtOwwZO777??!~```  ````````(!..~~~~~~~.(~~~~:~~~~~~~~....._<?111+zlz1zw++zOz???>?zOlXz
                        `.+<(dHHHH@Hmggg@MY!~ `````````````````````````__....~~~~.~<~~~~~~~~~~~~.~.......`.`. _~!??777zwwzz??zwrww
                       `.z<:+WHHM#HM@HH9^````` ....`````` `` ``````````......~.~.~~<~~~~~~~~~~....~......```````````.-_<zUXAOzrzXy
                    ` `.zz<<d@MNNNNM3~._```````_..```. ... `````````.`..`......~~~~~~~~~~~~...........``````````` .JuwXWHH@@HkkkXf
          `       `  ` +??+zHMMNNNF_..```````` _. ``` `      ``````.```.........~~~~~~~~.........`.````````````.(twQHM@@@@@HHHMHg@
              `  `  ` (==l=dMMMMMD...``````. `._ ``` ``````` _...`..`..`.........~~___`....`.``````````````` .(ugHMMHH@@MHHHHHHkff
               `     (1tlluMMNMNF....`````. ` _``` ``` ``````` _~___..`......~~_`````````````````````````` .JdHHmmH@MHHHHWWpWyWHHH
          `       ``.1wrlzdMMNN#~..__````````-.` `` ````` ```````` `___--_~~._.````````````````````````` .jXbpkmmHHHUUuzvzVUZyVfpf
                `  .+zuwzdMMMMMK_.(> ``````` ._` `` ` `````` `````````  ``` ````````````````````` ` `  .uWbpbkHbpWUXzzZOz11>;<1zvU
                ` .+zX0rwWMNN#Ht`.d}   .``  ~. `` ```````````` ````````` ` `` `` `````` ``````` `` ` .dWUZXyyfWU0vwwC<>;>>>>;:<zrt
                  (=dXvXWMMNNMH% (#`   . ``._.```````` ```` ``` ` ` ` ` `  `  `  `  `` ``` ` ` ``` .dWZZXyWUXXX0VC<<(>;;;;<<<:(+wy
          `   `` .=zXXwXHMNNN#M:.Ht  ` ~_``.~.``` `` ```````` ```` ``` ` ``  ` `` `` ``` `` ```` (XWyZyyyZXXp9C<~~~(<<:~~~_((+zwXf
               `.+zw0rXXMNNNNNN<.wA+.` ~_``.~_```` ```````````` ``` `  `  ` ` `  ` `` ` ` ````.(HHHVVVWXWpWY>~~~~~:~~~~_:<?COVZXzu
            ` ` (trwzzXHNNNNMNN>(wWMs_` _``.._-` ```````` `` ```  `` `` `  ` ` ``   `  ` `  .JHMHHWHmHHUY>:::~:~~~~_((><<<~~~<1Owu
             ` (OrrwXwX#NNMMNM$_(XWMMy-`. ``.~__````````````` ``` `  ` ``` ` ` ` `` `` `  .d@M@@HHH90C;:::::;<::~~:~::::~~~~~.._<?
          `   -wzzuuvdMMMMMM6<:(wXyWMHk,__   ._~-` ````````````  `  `` ` `  ``` ````` ..gMMMH9UYYC<<<+<<<<:::::_((_:~::::~~~~_...`

	 */




}

