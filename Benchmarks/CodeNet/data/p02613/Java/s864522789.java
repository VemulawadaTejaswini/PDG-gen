		Scanner sc = new Scanner(System.in);
		String[] l = sc.nextLine().split();
		int total = Integer.parseInt(l[0]);

		int a = 0;
		int w = 0;
		int t = 0;
		int r = 0;


		while (sc.hasNext()) {
          	switch(sc.nextLine()) {
             case "AC":
                a++;
                break;
             case "WA":
                w++;
                break;
             case "TLE":
                t++;
                break;
             case "RE":
                r++;
                break;
            }
		}
		System.out.println("AC x "+a);
		System.out.println("WA x "+w);
          		System.out.println("TLE x "+t);
          		System.out.println("RE x "+r);