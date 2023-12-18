        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        double ret = (double)d/(double)s;

        if (ret <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();